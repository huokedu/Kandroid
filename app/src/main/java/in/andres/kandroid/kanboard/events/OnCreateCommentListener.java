package in.andres.kandroid.kanboard.events;

/**
 * Created by Thomas Andres on 24.01.17.
 */

public interface OnCreateCommentListener {
    void onCreateComment(boolean success, Integer commentid);
}