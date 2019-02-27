package com.builtbroken.builder.pipe.nodes.json;

import com.builtbroken.builder.References;
import com.builtbroken.builder.pipe.nodes.IPipeNode;
import com.builtbroken.builder.pipe.nodes.NodeType;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;
import java.util.Queue;

/**
 * Splits JSON objects into smaller parts
 * <p>
 * Created by Dark(DarkGuardsman, Robert) on 2019-02-27.
 */
public class PipeNodeJsonSplitter implements IPipeNode
{
    @Override
    public void receive(JsonObject data, Object currentObject, Queue<Object> objectsOut)
    {
        if (currentObject instanceof JsonArray)
        {
            for (JsonElement element : ((JsonArray) currentObject))
            {
                if (element.isJsonObject())
                {
                    objectsOut.add(element.deepCopy());
                }
                else
                {
                    throw new IllegalArgumentException("PipeNodeJsonSplitter: Can only split by objects in an array. Primitives and arrays are not considered there own objects for the pipe.");
                }
            }
        }
    }

    @Override
    public NodeType getNodeType()
    {
        return NodeType.JSON_EDITOR;
    }

    @Override
    public String getUniqueID()
    {
        return References.PIPE_JSON_SPLITTER;
    }
}
