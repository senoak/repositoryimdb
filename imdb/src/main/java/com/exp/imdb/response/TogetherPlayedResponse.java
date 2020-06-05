package com.exp.imdb.response;

public class TogetherPlayedResponse extends BaseResponse {

	private boolean isPlayed = Boolean.FALSE;

	public boolean isPlayed() {
		return isPlayed;
	}

	public void setPlayed(boolean isPlayed) {
		this.isPlayed = isPlayed;
	}
}
