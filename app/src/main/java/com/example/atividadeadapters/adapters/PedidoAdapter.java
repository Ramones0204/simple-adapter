package com.example.atividadeadapters.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.atividadeadapters.R;
import com.example.atividadeadapters.entidades.Pedido;

import java.util.List;

public class PedidoAdapter extends BaseAdapter {

    Context context;
    List<Pedido> colecao;
    LayoutInflater inflter;

    public PedidoAdapter(final Context applicationContext,
                         final List<Pedido> colecao) {
        this.context = applicationContext;
        this.colecao = colecao;

    }


    @Override
    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecao.get(i);
    }

    private Pedido parsetItem(int i){
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_pedido,
                            viewGroup, false);
        }

        // pega o objeto corrente da lista
        Pedido pedido = parsetItem(i);

        //Neste ponto vc ira popular os dados do seu layout,
        //utilizando JAVA.

        TextView campoCliente, campoProduto;

        //CASO não queria declarar um campo
        //((TextView)view.findViewById(R.id.txtItemNome)).setText(pessoa.getNome());

        campoCliente = view.findViewById(R.id.txtItemCliente);
        campoProduto = view.findViewById(R.id.txtItemCliente);

        campoCliente.setText(pedido.getCliente());
        campoProduto.setText(pedido.getProduto());

        return view;
    }


}
