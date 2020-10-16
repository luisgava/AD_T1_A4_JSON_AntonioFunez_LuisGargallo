package modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
	
	String issueDate;
	List<ForecastDay> forecastDay;

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public List<ForecastDay> getForecastDay() {
		return forecastDay;
	}

	public void setForecastDay(List<ForecastDay> forecastDay) {
		this.forecastDay = forecastDay;
	}
}
