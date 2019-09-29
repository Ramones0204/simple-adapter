package com.example.atividadeadapters.atividades;

import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.atividadeadapters.entidades.Pedido;

import java.util.ArrayList;
import java.util.List;

public class DefaultAtctivity  extends AppCompatActivity {
    public EditText txtCliente;
    public EditText txtData;
    public EditText txtProduto;
    public EditText txtValor;
    public List<Pedido> lista = new ArrayList<>();
    public ListView minhaLista;
}
