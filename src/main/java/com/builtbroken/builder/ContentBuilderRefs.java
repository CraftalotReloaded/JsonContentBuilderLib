package com.builtbroken.builder;

/**
 * Created by Dark(DarkGuardsman, Robert) on 2/26/19.
 */
public class ContentBuilderRefs
{

    //==== PIPE IDs ======
    public static final String PIPE_JSON = "json";
    public static final String PIPE_ID = "com.builtbroken";
    public static final String PIPE_COMMENT_REMOVER = PIPE_ID + ":json.comment.remover";
    public static final String PIPE_JSON_SPLITTER = PIPE_ID + ":json.splitter";


    public static final String PIPE_BUILDER = "builder";
    public static final String PIPE_OBJECT_CREATOR = PIPE_ID + ":builder.creator";


    public static final String PIPE_MAPPER = "mapper";
    public static final String PIPE_FIELD_MAPPER = PIPE_MAPPER + ":fields";
    public static final String PIPE_LINK_MAPPER = PIPE_MAPPER + ":links";
}
