package com.vincentbrison.testrecyclerview;

/**
 * Dummy entry which serve has a model for the recycler view
 */
public class DummyEntry {

    private String mTextToDisplay;

    public DummyEntry(String textToDisplay) {
        mTextToDisplay = textToDisplay;
    }

    public String getTextToDisplay() {
        return mTextToDisplay;
    }
}
