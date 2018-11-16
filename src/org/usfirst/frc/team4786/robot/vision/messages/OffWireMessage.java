package org.usfirst.frc.team4786.robot.vision.messages;

import JSON.json.simple.JSONObject;
import JSON.json.simple.parser.JSONParser;
import JSON.json.simple.parser.ParseException;

/**
 * Used to convert Strings into OffWireMessage objects, which can be interpreted
 * as generic VisionMessages.
 */
public class OffWireMessage extends VisionMessage {

    private boolean mValid = false;
    private String mType = "unknown";
    private String mMessage = "{}";

    public OffWireMessage(String message) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject j = (JSONObject) parser.parse(message);
            mType = (String) j.get("type");
            mMessage = (String) j.get("message");
            mValid = true;
        } catch (ParseException e) {
        }
    }

    public boolean isValid() {
        return mValid;
    }

    @Override
    public String getType() {
        return mType;
    }

    @Override
    public String getMessage() {
        return mMessage;
    }
}
