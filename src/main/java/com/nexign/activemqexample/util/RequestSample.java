package com.nexign.activemqexample.util;

public enum RequestSample {

    CREATE_PAYMENT_STRING("{\"_id\":{\"$oid\":\"5e8d27101561bb7533cfb3c7\"}}"),

    GET_LIST_MPK("{\"client_id\":\"1-37PCTRD\",\"user_id\":\"1-37TPIP6\",\"login\":\"79233359922\"," +
            "\"role\":\"Driver\",\"contract_id\":\"1-380B94P\",\"card_id\":\"13215780\"," +
            "\"card_number\":\"7005839990006653\",\"card_expire\":\"3710\",\"device_id\":\"SID-355555-Y5\"," +
            "\"device_name\":\"Nokia +79233359922\",\"application_id\":\"3f5d961b-7937-11ea-8003-000c2902b124\"}"),

    CREATE_MPK("[{\"client_id\":\"1-37PCTRD\",\"user_id\":\"1-37TPIP6\",\"login\":\"79233359922\"," +
            "\"role\":\"NoDriver\",\"contract_id\":\"1-380B94P\",\"card_id\":\"13215780\"," +
            "\"card_number\":\"7005839990006653\",\"card_expire\":\"3710\",\"device_id\":\"SID-340567-Y3\"," +
            "\"device_name\":\"Nokia +7999999999\",\"rsa_key\":\"\"," +
            "\"rsa_public\":\"LS0tLS1CRUdJTiBSU0EgUFVCTElDIEtFWS0tLS0tCk1JSUJJakFOQmdrcWhraUc5dzBCQVFFRkFBT0NBUThBTUl" +
            "JQkNnS0NBUUVBb3dFQ2w4dytLLytuRDJ4NTB1K0wKaUhyN0ZTazJNL2VBcmlKZ3lIcTJsTTJSOE1WeEowTUt3R3JJYmoydFpVRUpVazd" +
            "hUU82WWVPRGh3ZTNoRlVaUgpaUWRlN2t2bXRmQUtnb2JGVWNoeGFZaUJkcTU0cjVJR21mS0pYOE1oK01UQ3RRYUZzdk9nYmIrb2pPQU5" +
            "leCtSCnQ3dzM2Yi9FS1Y1Z1k0T255M24vRDhkSkhOdXVmOTBqWHZodEZQMXh4ZklsWE02dWdmYUJJU2xYd3BMUFlUUkQKOEFqRC9nelFk" +
            "T04rR1ZtSTNtR3U0QUtWR2ZLYStJcU94N00wZ1pUTHZVdFdLb1VzUWlkL3dTNUIwUXY1bGViYgovZEdYZ0V1UFBQbjNyMmxtVStzY2RSY" +
            "0FzWkxLYVZRSDQ0ZGhuYytva1FlUG9tTVBITEI3TXhaaFBWYXdxWnlwCmJ3SURBUUFCCi0tLS0tRU5EIFJTQSBQVUJMSUMgS0VZLS0tLS0K\"," +
            "\"tries\":20,\"pin\":\"1234\",\"application_id\":\"aaad9ba3-7b3f-11ea-800a-000c2902b124\"," +
            "\"cipher_algorithm\":\"AES\\/CBC\\/NoPadding\",\"cipher_iv\":\"00000000000000000000000000000000\"," +
            "\"enc_adk\":\"253C42553F33ACC32AE4B2C6DA61EA29\",\"enc_algorithm\":\"PBKDF2WithHmacSHA1\"," +
            "\"enc_iteration_count\":\"1024\",\"enc_key_length\":\"128\"," +
            "\"enc_salt\":\"D533C7BC4F0DF0054C7B2A2CACB25386\",\"time_slot_length\":10,\"transaction_count\":0}]"),

    REFRESH_MPK("[{\"_id\":{\"$oid\":\"5e8d27101561bb7533cfb3c7\"}},{\"$set\":{\"transaction_count\":4}}]");

    private String string;

    RequestSample(String s){
        string = s;
    }

    public String value(){
        return string;
    }

}
