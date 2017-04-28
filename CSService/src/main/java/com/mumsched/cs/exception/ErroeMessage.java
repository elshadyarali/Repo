package com.mumsched.cs.exception;


public class ErroeMessage {

		private String title;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public long getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(long timeStamp) {
			this.timeStamp = timeStamp;
		}
		public String getDeveloperMessage() {
			return developerMessage;
		}
		public void setDeveloperMessage(String developerMessage) {
			this.developerMessage = developerMessage;
		}
		private int status;
		private String detail;
		private long timeStamp;
		private String developerMessage;
		// Getters and Setters ommited for brevity
		}