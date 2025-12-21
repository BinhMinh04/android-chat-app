package com.example.androidchatapp.model;

import com.google.firebase.Timestamp;

import java.util.List;

public class ChatroomModel {
        String chatroomTd;
        List<String> userIds;
        Timestamp lastMessageTimestamp;
        String lastMessageSenderId;

        public ChatroomModel() {
        }

        public ChatroomModel(String chatroomTd, List<String> userIds, Timestamp lastMessageTimestamp, String lastMessageSenderId) {
                this.chatroomTd = chatroomTd;
                this.userIds = userIds;
                this.lastMessageTimestamp = lastMessageTimestamp;
                this.lastMessageSenderId = lastMessageSenderId;
        }

        public String getChatroomTd() {
                return chatroomTd;
        }

        public void setChatroomTd(String chatroomTd) {
                this.chatroomTd = chatroomTd;
        }

        public List<String> getUserIds() {
                return userIds;
        }

        public void setUserIds(List<String> userIds) {
                this.userIds = userIds;
        }

        public Timestamp getLastMessageTimestamp() {
                return lastMessageTimestamp;
        }

        public void setLastMessageTimestamp(Timestamp lastMessageTimestamp) {
                this.lastMessageTimestamp = lastMessageTimestamp;
        }

        public String getLastMessageSenderId() {
                return lastMessageSenderId;
        }

        public void setLastMessageSenderId(String lastMessageSenderId) {
                this.lastMessageSenderId = lastMessageSenderId;
        }
}
