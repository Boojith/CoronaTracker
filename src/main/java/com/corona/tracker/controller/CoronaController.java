package com.corona.tracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.corona.tracker.model.Corona;

@Controller
public class CoronaController {
	@RequestMapping(value = "/corona")
	public String getStatus(Model model) {
		final String uri = "https://corona-virus-stats.herokuapp.com/api/v1/cases/countries-search?limit=200";

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject object = new JSONObject(result);
		String date=object.getJSONObject("data").getString("last_update");
		JSONArray rows = object.getJSONObject("data").getJSONArray("rows");
		List<Corona> coronaList = new ArrayList<Corona>();
		for (int i = 1; i < rows.length(); i++) {
			JSONObject row = rows.getJSONObject(i);
			Corona corona = new Corona();
			corona.setCountry(row.getString("country"));
			corona.setTotalCases(row.getString("total_cases"));
			corona.setNewCases(row.getString("new_cases"));
			corona.setTotalDeaths(row.getString("total_deaths"));
			corona.setNewDeaths(row.getString("new_deaths"));
			corona.setTotalRecovered(row.getString("total_recovered"));
			corona.setActiveCases(row.getString("active_cases"));
			coronaList.add(corona);

		}
		model.addAttribute("coronaList", coronaList);
		model.addAttribute("date", date);
		return "status/corona.html";
	}
}
