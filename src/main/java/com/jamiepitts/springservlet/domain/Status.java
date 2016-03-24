package com.jamiepitts.springservlet.domain;

public class Status {
    private String statusMessage;
    private String version;

    private Status() { }

    public Status (Builder builder){
        this.statusMessage = builder.statusMessage;
        this.version = builder.version;
    }

    public String getStatusMessage(){
        return statusMessage;
    }

    public String getVersion(){
        return version;
    }

    public static class Builder {
        private String statusMessage;
        private String version;

        public static Builder statusBuilder(){
            return new Builder();
        }

        public static Builder from(Status status){
            Builder builder = new Builder();
            builder.statusMessage = status.getStatusMessage();
            builder.version = status.getVersion();
            return builder;
        }

        public Builder withStatusMessage(String statusMessage){
            this.statusMessage = statusMessage;
            return this;
        }

        public Builder withVersion(String version){
            this.version = version;
            return this;
        }

        public Status build(){
            return new Status(this);
        }
    }
}
