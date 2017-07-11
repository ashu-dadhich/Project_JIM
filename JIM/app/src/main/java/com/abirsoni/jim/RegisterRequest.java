package com.abirsoni.jim;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abir on 7/10/2017.
 */
public class RegisterRequest extends StringRequest{
    private static final String REGISTER_REQUEST_URL = "http://theburningperceptive.com/Register.php";
    private Map<String, String> params;
    public RegisterRequest(int rollnumber, String name, String batch, String branch, String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("rollnumber", rollnumber+"");
        params.put("name", name);
        params.put("batch", batch);
        params.put("branch", branch);
        params.put("password", password);
 }

}
