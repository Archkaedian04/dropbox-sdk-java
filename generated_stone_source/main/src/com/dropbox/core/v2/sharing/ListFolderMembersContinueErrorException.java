/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * ListFolderMembersContinueError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserSharingRequests#listFolderMembersContinue(String)}. </p>
 */
public class ListFolderMembersContinueErrorException extends DbxApiException {
    // exception for routes:
    //     2/sharing/list_folder_members/continue

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserSharingRequests#listFolderMembersContinue(String)}.
     */
    public final ListFolderMembersContinueError errorValue;

    public ListFolderMembersContinueErrorException(String routeName, String requestId, LocalizedText userMessage, ListFolderMembersContinueError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}