/*
 *
 * CODENVY CONFIDENTIAL
 * ________________
 *
 * [2012] - [2013] Codenvy, S.A.
 * All Rights Reserved.
 * NOTICE: All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any. The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */

package com.codenvy.analytics.metrics;

/**
 * Predefined metrics.
 *
 * @author <a href="mailto:abazko@codenvy.com">Anatoliy Bazko</a>
 */
public enum MetricType {
    CREATED_WORKSPACES,
    DESTROYED_WORKSPACES,
    TOTAL_WORKSPACES,
    ACTIVE_WORKSPACES,
    NON_ACTIVE_WORKSPACES,
    NEW_ACTIVE_WORKSPACES,
    RETURNING_ACTIVE_WORKSPACES,
    ACTIVE_WORKSPACES_SET,
    ACTIVE_WS_SET, // for compatibility with 1.x

    CREATED_USERS,
    CREATED_USERS_FROM_AUTH,
    REMOVED_USERS,
    TOTAL_USERS,
    ACTIVE_USERS,
    ACTIVE_USERS_SET,
    NON_ACTIVE_USERS,
    NEW_ACTIVE_USERS,
    RETURNING_ACTIVE_USERS,

    USERS_LOGGED_IN_TYPES,
    USERS_LOGGED_IN_WITH_GITHUB,
    USERS_LOGGED_IN_WITH_GOOGLE,
    USERS_LOGGED_IN_WITH_FORM,
    USERS_LOGGED_IN_TOTAL,
    USERS_LOGGED_IN_WITH_GITHUB_PERCENT,
    USERS_LOGGED_IN_WITH_GOOGLE_PERCENT,
    USERS_LOGGED_IN_WITH_FORM_PERCENT,

    USER_INVITE,
    SHELL_LAUNCHED,
    USERS_ACCEPTED_INVITES,
    USERS_ACCEPTED_INVITES_PERCENT,
    USERS_ADDED_TO_WORKSPACES,
    USERS_ADDED_TO_WORKSPACES_USING_INVITATION,
    COMPLETED_PROFILES,

    CREATED_PROJECTS,
    DESTROYED_PROJECTS,
    TOTAL_PROJECTS,

    PROJECT_PAASES,
    PROJECT_PAAS_ANY,
    PROJECT_PAAS_AWS,
    PROJECT_PAAS_APPFOG,
    PROJECT_PAAS_CLOUDBEES,
    PROJECT_PAAS_CLOUDFOUNDRY,
    PROJECT_PAAS_GAE,
    PROJECT_PAAS_HEROKU,
    PROJECT_PAAS_OPENSHIFT,
    PROJECT_PAAS_TIER3,
    PROJECT_PAAS_MANYMO,
    PROJECT_NO_PAAS_DEFINED,

    PROJECT_TYPES,
    PROJECT_TYPE_JAR,
    PROJECT_TYPE_WAR,
    PROJECT_TYPE_JSP,
    PROJECT_TYPE_SPRING,
    PROJECT_TYPE_PHP,
    PROJECT_TYPE_DJANGO,
    PROJECT_TYPE_PYTHON,
    PROJECT_TYPE_JAVASCRIPT,
    PROJECT_TYPE_RUBY,
    PROJECT_TYPE_MMP,
    PROJECT_TYPE_NODEJS,
    PROJECT_TYPE_ANDROID,
    PROJECT_TYPE_OTHERS,

    PRODUCT_USAGE_SESSIONS_LIST,
    PRODUCT_USAGE_SESSIONS,
    PRODUCT_USAGE_CONDITION_BELOW_120_MIN,
    PRODUCT_USAGE_CONDITION_BETWEEN_120_AND_300_MIN,
    PRODUCT_USAGE_CONDITION_ABOVE_300_MIN,
    TIMELINE_PRODUCT_USAGE_CONDITION_BELOW_120_MIN,
    TIMELINE_PRODUCT_USAGE_CONDITION_BETWEEN_120_AND_300_MIN,
    TIMELINE_PRODUCT_USAGE_CONDITION_ABOVE_300_MIN,
    PRODUCT_USAGE_TIME_BELOW_1_MIN,
    PRODUCT_USAGE_TIME_BETWEEN_1_AND_10_MIN,
    PRODUCT_USAGE_TIME_BETWEEN_10_AND_60_MIN,
    PRODUCT_USAGE_TIME_ABOVE_60_MIN,
    PRODUCT_USAGE_TIME_TOTAL,
    PRODUCT_USAGE_SESSIONS_BELOW_1_MIN,
    PRODUCT_USAGE_SESSIONS_BETWEEN_1_AND_10_MIN,
    PRODUCT_USAGE_SESSIONS_BETWEEN_10_AND_60_MIN,
    PRODUCT_USAGE_SESSIONS_ABOVE_60_MIN,
    PRODUCT_USAGE_SESSIONS_TOTAL,
    PRODUCT_USAGE_USERS_BELOW_10_MIN,
    PRODUCT_USAGE_USERS_BETWEEN_10_AND_60_MIN,
    PRODUCT_USAGE_USERS_BETWEEN_60_AND_300_MIN,
    PRODUCT_USAGE_USERS_ABOVE_300_MIN,
    PRODUCT_USERS_TIME,
    PRODUCT_DOMAINS_TIME,
    PRODUCT_COMPANIES_TIME,

    RUNS_TIME,
    BUILDS_TIME,
    DEBUGS_TIME,

    RUNS,
    BUILDS,
    DEPLOYS,
    DEPLOYS_TO_PAAS,
    DEBUGS,
    CODE_REFACTORINGS,
    CODE_COMPLETIONS,
    FILE_MANIPULATIONS,

    CREATED_USERS_FROM_FACTORY,
    TEMPORARY_WORKSPACES_CREATED,
    CREATED_FACTORIES,
    CREATED_FACTORIES_SET,
    PRODUCT_USAGE_FACTORY_SESSIONS_LIST,
    WORKSPACES_WHERE_USERS_HAVE_SEVERAL_FACTORY_SESSIONS,
    WORKSPACES_WITH_ZERO_FACTORY_SESSIONS_LENGTH,
    REFERRERS_COUNT_TO_SPECIFIC_FACTORY,
    ACTIVE_ORG_ID_SET,
    ACCEPTED_FACTORIES_LIST,
    ACCEPTED_FACTORIES,
    FACTORY_SESSIONS,
    ANONYMOUS_FACTORY_SESSIONS,
    AUTHENTICATED_FACTORY_SESSIONS,
    ABANDONED_FACTORY_SESSIONS,
    CONVERTED_FACTORY_SESSIONS,
    FACTORY_SESSIONS_WITH_BUILD,
    FACTORY_SESSIONS_WITH_RUN,
    FACTORY_SESSIONS_WITH_DEPLOY,
    FACTORY_SESSIONS_WITH_BUILD_PERCENT,
    FACTORY_SESSIONS_WITH_RUN_PERCENT,
    FACTORY_SESSIONS_WITH_DEPLOY_PERCENT,
    FACTORY_SESSIONS_BELOW_10_MIN,
    FACTORY_SESSIONS_ABOVE_10_MIN,
    FACTORY_PRODUCT_USAGE_TIME_TOTAL,
    FACTORY_URL_ACCEPTED, // for compatibility with 1.x

    USERS_PROFILES,
    USERS_PROFILES_LIST,
    USERS_STATISTICS_LIST,
    USERS_ACTIVITY_LIST,
    USERS_ACTIVITY,

    USERS_TIME_IN_WORKSPACES,
    USERS_TIME_IN_WORKSPACES_LIST,

    TOP_FACTORY_SESSIONS_BY_1DAY,
    TOP_FACTORY_SESSIONS_BY_7DAY,
    TOP_FACTORY_SESSIONS_BY_30DAY,
    TOP_FACTORY_SESSIONS_BY_60DAY,
    TOP_FACTORY_SESSIONS_BY_90DAY,
    TOP_FACTORY_SESSIONS_BY_365DAY,
    TOP_FACTORY_SESSIONS_BY_LIFETIME,

    TOP_FACTORIES_BY_1DAY,
    TOP_FACTORIES_BY_7DAY,
    TOP_FACTORIES_BY_30DAY,
    TOP_FACTORIES_BY_60DAY,
    TOP_FACTORIES_BY_90DAY,
    TOP_FACTORIES_BY_365DAY,
    TOP_FACTORIES_BY_LIFETIME,

    TOP_REFERRERS_BY_1DAY,
    TOP_REFERRERS_BY_7DAY,
    TOP_REFERRERS_BY_30DAY,
    TOP_REFERRERS_BY_60DAY,
    TOP_REFERRERS_BY_90DAY,
    TOP_REFERRERS_BY_365DAY,
    TOP_REFERRERS_BY_LIFETIME,

    TOP_USERS_BY_1DAY,
    TOP_USERS_BY_7DAY,
    TOP_USERS_BY_30DAY,
    TOP_USERS_BY_60DAY,
    TOP_USERS_BY_90DAY,
    TOP_USERS_BY_365DAY,
    TOP_USERS_BY_LIFETIME,

    TOP_DOMAINS_BY_1DAY,
    TOP_DOMAINS_BY_7DAY,
    TOP_DOMAINS_BY_30DAY,
    TOP_DOMAINS_BY_60DAY,
    TOP_DOMAINS_BY_90DAY,
    TOP_DOMAINS_BY_365DAY,
    TOP_DOMAINS_BY_LIFETIME,

    TOP_COMPANIES_BY_1DAY,
    TOP_COMPANIES_BY_7DAY,
    TOP_COMPANIES_BY_30DAY,
    TOP_COMPANIES_BY_60DAY,
    TOP_COMPANIES_BY_90DAY,
    TOP_COMPANIES_BY_365DAY,
    TOP_COMPANIES_BY_LIFETIME,

    RUNNER_TOTAL_TIME,

    IDE_USAGES,
    IDE_USAGE_FILE_NEW_FOLDER,
    IDE_USAGE_FILE_NEW_PACKAGE,
    IDE_USAGE_FILE_NEW_TEXT_FILE,
    IDE_USAGE_FILE_NEW_XML_FILE,
    IDE_USAGE_FILE_NEW_JSF_FILE,
    IDE_USAGE_FILE_NEW_HTML_FILE,
    IDE_USAGE_FILE_NEW_CSS_FILE,
    IDE_USAGE_FILE_NEW_JAVA_CLASS_FILE,
    IDE_USAGE_FILE_NEW_JSP_FILE,
    IDE_USAGE_FILE_NEW_RUBY_FILE,
    IDE_USAGE_FILE_NEW_PHP_FILE,
    IDE_USAGE_FILE_NEW_PYTHON_FILE,
    IDE_USAGE_FILE_NEW_YAML_FILE,

    IDE_USAGE_FILE_UPLOAD_FILE,
    IDE_USAGE_FILE_UPLOAD_ZIPPED_FOLDER,
    IDE_USAGE_FILE_OPEN_LOCAL_FILE,
    IDE_USAGE_FILE_OPEN_FILE_BY_PATH,
    IDE_USAGE_FILE_OPEN_BY_URL,
    IDE_USAGE_FILE_DOWNLOAD,
    IDE_USAGE_FILE_DOWNLOAD_ZIPPED_FOLDER,
    IDE_USAGE_FILE_SAVE,
    IDE_USAGE_FILE_SAVE_AS,
    IDE_USAGE_FILE_CLOSE,
    IDE_USAGE_FILE_OPEN,
    IDE_USAGE_FILE_DELETE,
    IDE_USAGE_FILE_RENAME,
    IDE_USAGE_FILE_SEARCH,

    IDE_USAGE_PROJECT_CREATE_NEW_PROJECT,
    IDE_USAGE_PROJECT_CREATE_NEW_MODULE,
    IDE_USAGE_PROJECT_IMPORT_FROM_GITHUB,
    IDE_USAGE_PROJECT_OPEN,
    IDE_USAGE_PROJECT_CLOSE,
    IDE_USAGE_PROJECT_PROPERTIES_VIEW,
    IDE_USAGE_PROJECT_OPEN_RESOURCE,
    IDE_USAGE_PROJECT_ENABLE_COLLABORATION_MODE,
    IDE_USAGE_PROJECT_USER_JOINED_WORKSPACE_IN_COLLABORATION_MODE,
    IDE_USAGE_PROJECT_USER_LEFT_WORKSPACE,
    IDE_USAGE_PROJECT_UPDATE_DEPENDENCIES,
    IDE_USAGE_PROJECT_SHOW_SYNTAX_ERROR_HIGHLIGHTING,
    IDE_USAGE_PROJECT_DISABLE_SYNTAX_ERROR_HIGHLIGHTING,
    IDE_USAGE_PROJECT_BUILD,
    IDE_USAGE_PROJECT_BUILD_PUBLISH,

    IDE_USAGE_EDIT_CUT_ITEM,
    IDE_USAGE_EDIT_COPY_ITEM,
    IDE_USAGE_EDIT_PASTE_ITEM,
    IDE_USAGE_EDIT_UNDO_TYPE,
    IDE_USAGE_EDIT_REDO_TYPE,
    IDE_USAGE_EDIT_FORMAT,
    IDE_USAGE_EDIT_ADD_BLOCK_COMMENT,
    IDE_USAGE_EDIT_REMOVE_BLOCK_COMMENT,
    IDE_USAGE_EDIT_TOGGLE_COMMENT,
    IDE_USAGE_EDIT_FIND_AND_REPLACE,
    IDE_USAGE_EDIT_HIDE_LINE_NUMBERS,
    IDE_USAGE_EDIT_DELETE_CURRENT_LINE,
    IDE_USAGE_EDIT_GO_TO_LINE,
    IDE_USAGE_EDIT_DELETE,
    IDE_USAGE_EDIT_SELECT_ALL,
    IDE_USAGE_EDIT_MOVE_LINE_UP,
    IDE_USAGE_EDIT_MOVE_LINE_DOWN,

    IDE_USAGE_EDIT_SOURCE_GENERATE_GETTES_AND_SETTERS,
    IDE_USAGE_EDIT_SOURCE_GENERATE_CONSTRUCTOR_USING_FIELDS,

    IDE_USAGE_EDIT_REFACTOR_RENAME,

    IDE_USAGE_VIEW_PROPERTIES,
    IDE_USAGE_VIEW_GO_TO_FOLDER,
    IDE_USAGE_VIEW_PROGRESS,
    IDE_USAGE_VIEW_OUTPUT,
    IDE_USAGE_VIEW_LOG,
    IDE_USAGE_VIEW_SHOW_HIDDEN_FILES,
    IDE_USAGE_VIEW_COLLABORATION,

    IDE_USAGE_RUN_DEBUG_APPLICATION,
    IDE_USAGE_RUN_RUN_APPLICATION,
    IDE_USAGE_RUN_STOP_APPLICATION,
    IDE_USAGE_RUN_SHOW_LOGS,

    IDE_USAGE_GIT_ADD,
    IDE_USAGE_GIT_RESET,
    IDE_USAGE_GIT_REMOVE,
    IDE_USAGE_GIT_COMMIT,
    IDE_USAGE_GIT_BRANCHES,
    IDE_USAGE_GIT_MERGE,
    IDE_USAGE_GIT_RESET_INDEX,
    IDE_USAGE_GIT_CLONE_REPOSITORY,
    IDE_USAGE_GIT_DELETE_REPOSITORY,
    IDE_USAGE_GIT_SHOW_HISTORY,
    IDE_USAGE_GIT_STATUS,
    IDE_USAGE_GIT_GIT_URL_READ_ONLY,

    IDE_USAGE_GIT_REMOTE_PUSH,
    IDE_USAGE_GIT_REMOTE_FETCH,
    IDE_USAGE_GIT_REMOTE_PULL,
    IDE_USAGE_GIT_REMOTE_REMOTES,

    IDE_USAGE_PAAS_MANY_MO_ANDROID_DEPLOY,

    IDE_USAGE_PAAS_APP_FOG_CREATE_APPLICATION,
    IDE_USAGE_PAAS_APP_FOG_APPLICATIONS,
    IDE_USAGE_PAAS_APP_FOG_SWITCH_ACCOUNT,

    IDE_USAGE_PAAS_CLOUD_BEES_CREATE_APPLICATION,
    IDE_USAGE_PAAS_CLOUD_BEES_APPLICATIONS,
    IDE_USAGE_PAAS_CLOUD_BEES_SWITCH_ACCOUNT,
    IDE_USAGE_PAAS_CLOUD_BEES_CREATE_ACCOUNT,

    IDE_USAGE_PAAS_ELASTIC_BEANSTALK_CREATE_APPLICATION,
    IDE_USAGE_PAAS_ELASTIC_BEANSTALK_MANAGE_APPLICATION,
    IDE_USAGE_PAAS_ELASTIC_BEANSTALK_SWITCH_ACCOUNT,
    IDE_USAGE_PAAS_ELASTIC_BEANSTALK_EC2_MANAGEMENT,
    IDE_USAGE_PAAS_ELASTIC_BEANSTALK_S3_MANAGEMENT,

    IDE_USAGE_PAAS_GOOGLE_APP_ENGINE_UPDATE_APPLICATION,
    IDE_USAGE_PAAS_GOOGLE_APP_ENGINE_CREATE_APPLICATION,
    IDE_USAGE_PAAS_GOOGLE_APP_ENGINE_LOGIN,

    IDE_USAGE_PAAS_HEROKU_CREATE_APPLICATION,
    IDE_USAGE_PAAS_HEROKU_APPLICATIONS,
    IDE_USAGE_PAAS_HEROKU_DEPLOY_PUBLIC_KEY,
    IDE_USAGE_PAAS_HEROKU_SWITCH_ACCOUNT,

    IDE_USAGE_PAAS_OPEN_SHIFT_CHANGE_NAMESPACE,
    IDE_USAGE_PAAS_OPEN_SHIFT_APPLICATIONS,
    IDE_USAGE_PAAS_OPEN_SHIFT_UPDATE_SHH_PUBLIC_KEY,
    IDE_USAGE_PAAS_OPEN_SHIFT_SWITCH_ACCOUNT,

    IDE_USAGE_WINDOW_SHOW_VIEW_PROJECT_EXPLORE,
    IDE_USAGE_WINDOW_SHOW_VIEW_PACKAGE_EXPLORE,

    IDE_USAGE_WINDOW_NAVIGATION_NEXT_EDITOR,
    IDE_USAGE_WINDOW_NAVIGATION_PREVIOUS_EDITOR,
    IDE_USAGE_WINDOW_WELCOME,
    IDE_USAGE_WINDOW_PREFERENCES,

    IDE_USAGE_SHELL,
    IDE_USAGE_PROFILE,
    IDE_USAGE_LOGOUT,

    USERS_EVENTS
}
