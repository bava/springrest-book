package com.apress.dto;

import java.util.Collection;

public class VoteResult {

	private int totalVotes;
	private Collection<OptionCount> results;

	public int getTotalVotes() {
		return totalVotes;
	}
	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}
	public Collection<OptionCount> getResults() {
		return results;
	}
	public void setResults(Collection<OptionCount> results) {
		this.results = results;
	}
}
