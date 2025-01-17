/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * UploadSessionAppendError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilesRequests#uploadSessionAppend(String,long)} and {@link
 * DbxUserFilesRequests#uploadSessionAppendV2(UploadSessionCursor)}. </p>
 */
public class UploadSessionAppendErrorException extends DbxApiException {
    // exception for routes:
    //     2/files/upload_session/append
    //     2/files/upload_session/append_v2

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserFilesRequests#uploadSessionAppend(String,long)} and {@link
     * DbxUserFilesRequests#uploadSessionAppendV2(UploadSessionCursor)}.
     */
    public final UploadSessionAppendError errorValue;

    public UploadSessionAppendErrorException(String routeName, String requestId, LocalizedText userMessage, UploadSessionAppendError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
