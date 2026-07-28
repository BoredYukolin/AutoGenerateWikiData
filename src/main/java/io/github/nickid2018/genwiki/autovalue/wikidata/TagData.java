package io.github.nickid2018.genwiki.autovalue.wikidata;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.*;

public class TagData extends JsonWikiData {

    private final Set<String> values = new TreeSet<>();

    public void put(String key) {
        values.add(key);
    }

    @Override
    public JsonElement asJsonData() {
        JsonObject obj = new JsonObject();
        JsonArray array = new JsonArray();
        values.forEach(array::add);
        obj.add("values", array);
        return obj;
    }
}
