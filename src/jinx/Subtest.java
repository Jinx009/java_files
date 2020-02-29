package jinx;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Subtest {

    public static void main(String[] args){
        String json = "[\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁1\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"地磁0\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像1\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁1\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"地磁0\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像1\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"地磁1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"地磁0\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"摄像1\",\"d\":\"摄像0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"地磁1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"地磁0\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"摄像1\"},\n" +
                "{\"a\":\"摄像0\",\"b\":\"摄像0\",\"c\":\"摄像0\",\"d\":\"摄像0\"},\n" +
                "\n" +
                "]";

        JSONArray arr = JSONObject.parseArray(json);
        JSONArray _a = new JSONArray();
        for(int i = 0;i<arr.size();i++){
            JSONObject ojb = arr.getJSONObject(i);
            String a = ojb.getString("a");
            String b = ojb.getString("b");
            String c = ojb.getString("c");
            String d = ojb.getString("d");
            boolean t = true;
            if(a.equals("地磁1")&&b.equals("地磁1")){
                t = false;
            }
            if(a.equals("地磁0")&&b.equals("地磁0")){
                t = false;
            }
            if(b.equals("地磁1")&&c.equals("地磁1")){
                t = false;
            }
            if(b.equals("地磁0")&&c.equals("地磁0")){
                t = false;
            }
            if(c.equals("地磁1")&&d.equals("地磁1")){
                t = false;
            }
            if(d.equals("地磁0")&&c.equals("地磁0")){
                t = false;
            }
            if(a.equals("地磁1")&&c.equals("地磁1")&&!b.equals("地磁1")&&!b.equals("地磁0")){
                t = false;
            }
            if(b.equals("地磁1")&&d.equals("地磁1")&&!c.equals("地磁1")&&!c.equals("地磁0")){
                t = false;
            }
            if(a.equals("地磁0")&&c.equals("地磁0")&&!b.equals("地磁1")&&!b.equals("地磁0")){
                t = false;
            }
            if(b.equals("地磁0")&&d.equals("地磁0")&&!c.equals("地磁1")&&!c.equals("地磁0")){
                t = false;
            }
            if(a.equals("地磁1")&&d.equals("地磁1")&&!b.equals("地磁1")&&!b.equals("地磁0")&&!c.equals("地磁1")&&!c.equals("地磁0")){
                t = false;
            }
            if(a.equals("地磁0")&&d.equals("地磁0")&&!b.equals("地磁1")&&!b.equals("地磁0")&&!c.equals("地磁1")&&!c.equals("地磁0")){
                t = false;
            }
            if(t){
                JSONObject j = new JSONObject();
                j.put("a",a);
                j.put("b",b);
                j.put("c",c);
                j.put("d",d);
                _a.add(j);
            }
        }
        System.out.println(JSONObject.toJSONString(_a));
    }

}