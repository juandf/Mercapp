package com.android.store.mercapp.Controllers;

import android.content.Context;
import android.util.Log;

import com.android.store.mercapp.Models.Tiendas;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TiendaController {
    private Context mContext;

    public TiendaController (Context context){this.mContext = context;}

    public void getTiendas()
    {
        RequestQueue queue = Volley.newRequestQueue(this.mContext);
    }

    private StringRequest GetStringRequestGet(String Type, final Tiendas tienda)
    {
        StringRequest stringRequest = null;
        switch (Type)
        {
            case "LISTA":
                break;
            case "CREATE":
                break;
            case "DELETE":
                break;
            case "UPDATE":
                break;
        }

       /* switch (Type)
        {
            case "LISTA":
                stringRequest = new StringRequest(Request.Method.GET, "http://192.168.1.166/RestFactura02.NetEnvironment/APrcGetClientes.ASPX", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        List<Cliente> mContacts;
                        Gson gson = new Gson();
                        java.lang.reflect.Type listType = new TypeToken<List<Cliente>>(){}.getType();
                        mContacts = gson.fromJson(response, listType);

                        HomeActivity.clients.clear();
                        HomeActivity.clients.addAll(mContacts);
                        HomeActivity.adapter.notifyDataSetChanged();
                        Log.i("LOG",response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("ERROR",error.getMessage());
                    }
                });
                break;
            case "CREATE":
                stringRequest = new StringRequest(Request.Method.POST, "http://192.168.1.166/RestFactura02.NetEnvironment/APrcCreateCliente.ASPX", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        getClientes("");
                        Log.i("LOG",response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("ERROR",error.getMessage());
                    }
                }){
                    @Override
                    protected Map<String, String> getParams()
                    {
                        Map<String, String>  params = new HashMap<String, String>();
                        params.put("cliId", cliente.getCliId());
                        params.put("cliNom", cliente.getCliNom());
                        params.put("cliEmail", cliente.getCliEmail());

                        return params;
                    }
                };
                break;
            case "DELETE":
                stringRequest = new StringRequest(Request.Method.POST, "http://192.168.1.166/RestFactura02.NetEnvironment/aPrcDeleteCliente.ASPX", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        getClientes("");
                        Log.i("LOG",response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("ERROR",error.getMessage());
                    }
                }){
                    @Override
                    protected  Map<String, String> getParams()
                    {
                        Map<String, String>  params = new HashMap<String, String>();
                        params.put("cliId", cliente.getCliId());

                        return params;
                    }
                };
                break;
            case "UPDATE":
                stringRequest = new StringRequest(Request.Method.POST, "http://192.168.1.166/RestFactura02.NetEnvironment/aPrcUpdateCliente.ASPX", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        getClientes("");
                        Log.i("LOG",response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("ERROR",error.getMessage());
                    }
                }){
                    @Override
                    protected  Map<String, String> getParams()
                    {
                        Map<String, String>  params = new HashMap<String, String>();
                        params.put("cliId", cliente.getCliId());
                        params.put("cliNom", cliente.getCliNom());
                        params.put("cliEmail", cliente.getCliEmail());

                        return params;
                    }
                };
                break;
        }*/

        return stringRequest;
    }
}
