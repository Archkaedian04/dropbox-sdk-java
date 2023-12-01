/* DO NOT EDIT */
/* This file was generated by Stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.fileproperties.ModifyTemplateError;
import com.dropbox.core.v2.fileproperties.ModifyTemplateErrorException;
import com.dropbox.core.v2.fileproperties.PropertyFieldTemplate;
import com.dropbox.core.v2.fileproperties.UpdateTemplateArg;
import com.dropbox.core.v2.fileproperties.UpdateTemplateResult;

import java.util.List;

/**
 * The request builder returned by {@link
 * DbxTeamTeamRequests#propertiesTemplateUpdateBuilder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class PropertiesTemplateUpdateBuilder {
    private final DbxTeamTeamRequests _client;
    private final UpdateTemplateArg.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue team
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    PropertiesTemplateUpdateBuilder(DbxTeamTeamRequests _client, UpdateTemplateArg.Builder _builder) {
        if (_client == null) {
            throw new NullPointerException("_client");
        }
        this._client = _client;
        if (_builder == null) {
            throw new NullPointerException("_builder");
        }
        this._builder = _builder;
    }

    /**
     * Set value for optional field.
     *
     * @param name  A display name for the template. template names can be up to
     *     256 bytes.
     *
     * @return this builder
     */
    public PropertiesTemplateUpdateBuilder withName(String name) {
        this._builder.withName(name);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param description  Description for the new template. Template
     *     descriptions can be up to 1024 bytes.
     *
     * @return this builder
     */
    public PropertiesTemplateUpdateBuilder withDescription(String description) {
        this._builder.withDescription(description);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param addFields  Property field templates to be added to the group
     *     template. There can be up to 32 properties in a single template. Must
     *     not contain a {@code null} item.
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public PropertiesTemplateUpdateBuilder withAddFields(List<PropertyFieldTemplate> addFields) {
        this._builder.withAddFields(addFields);
        return this;
    }

    /**
     * Issues the request.
     */
    @SuppressWarnings("deprecation")
    public UpdateTemplateResult start() throws ModifyTemplateErrorException, DbxException {
        UpdateTemplateArg arg_ = this._builder.build();
        return _client.propertiesTemplateUpdate(arg_);
    }
}