package com.example.ensiasclassroom.models;

import java.io.Serializable;
import java.util.Date;

public class ChatMessage implements Serializable {
    public String receiverId, senderId, message, dateTime;
    public Date dateObject;
}
