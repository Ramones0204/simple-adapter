package com.example.atividadeadapters.atividades;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.atividadeadapters.R;
import com.example.atividadeadapters.entidades.Pedido;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimpleAdapter extends DefaultAtctivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
    }

    public void adicionar(View view) {

        //ENTRADA DE DADOS
        //Captura o componente EditText da VIEW
        txtCliente = findViewById(R.id.txtCliente);
        txtData = findViewById(R.id.txtData);
        txtProduto = findViewById(R.id.txtProduto);
        txtValor = findViewById(R.id.txtValor);


        String cliente, data, produto;

        cliente = txtCliente.getText().toString();
        data = txtData.getText().toString();
        produto = txtProduto.getText().toString();
        BigDecimal bigDecimal = new BigDecimal(txtValor.getText().toString());


        Pedido pedido = new Pedido(cliente,data,produto,bigDecimal);

        lista.add(pedido);

        //PROCESSAMENTO
        //Convertendo a lista em um List<HashMap<String,String>
        //para o simpleAdapter

        List<String> colecaoArrayAdapter = new ArrayList<>();

        List<HashMap<String, String>> colecao = new ArrayList<>();
        //criando colecao para o adapter
        for (Pedido p : lista) {
            HashMap<String, String> map = new HashMap<>();
            map.put("cliente", p.getCliente());
            map.put("data", p.getData());
            map.put("produto", p.getProduto());

            colecao.add(map);
            colecaoArrayAdapter.add(p.getCliente());
        }

        //Fazer o mapeamento da colecao com o layout do item
        String[] de = {"valor", "data", "produto","valor"};
        int[] para = {R.id.txtCliente,R.id.txtProduto,R.id.txtValor};

        //SAIDA

        minhaLista = findViewById(R.id.minhaLista);

        //SIMPLE ADAPTER
        android.widget.SimpleAdapter adapter =new android.widget.SimpleAdapter(this,colecao, R.layout.item,de,para);
        Toast.makeText(getApplicationContext(),"Cliente "+ cliente + "Produto" + produto + "inserido ",Toast.LENGTH_LONG).show();


        minhaLista.setAdapter(adapter);

    }

}
