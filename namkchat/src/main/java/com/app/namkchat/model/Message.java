package com.app.namkchat.model;

public class Message {
    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }

    public String getName_of() {
        return name_of;
    }

    public void setName_of(String name_of) {
        this.name_of = name_of;
    }


    public String getUrlProfilePic() {
        return urlProfilePic;
    }

    public void setUrlProfilePic(String urlProfilePic) {
        this.urlProfilePic = urlProfilePic;
    }

    public String getType_mensaje() {
        return type_mensaje;
    }

    public void setType_mensaje(String type_mensaje) {
        this.type_mensaje = type_mensaje;
    }

    private String mesg;
    private String name_of;
    private String urlProfilePic;

    private String type_mensaje;

}
