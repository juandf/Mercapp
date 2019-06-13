package com.android.store.mercapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.store.mercapp.Entidades.Storage;
import com.android.store.mercapp.R;

import java.util.ArrayList;

public class StorageAdapter extends RecyclerView.Adapter<StorageAdapter.ViewHolderDatos> implements View.OnClickListener{
    public ArrayList<Storage> ListStorage;

    public StorageAdapter(ArrayList<Storage> listStorage) {
        ListStorage = listStorage;
    }

    @Override
    public void onClick(View view) {

    }

    @NonNull
    @Override
    public StorageAdapter.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_store,parent,false);
        return new ViewHolderDatos(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull StorageAdapter.ViewHolderDatos holder, int position) {
        holder.NombreS.setText(ListStorage.get(position).getNombre());
        holder.DireccionS.setText(ListStorage.get(position).getDireccion());
        holder.EstadoS.setText(ListStorage.get(position).getEstado());
    }

    @Override
    public int getItemCount() {
        return ListStorage.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView NombreS,DireccionS,EstadoS;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            NombreS = (TextView) itemView.findViewById(R.id.txtStorageNombre);
            DireccionS = (TextView) itemView.findViewById(R.id.txtStorageDireccion);
            EstadoS = (TextView) itemView.findViewById(R.id.txtStorageEstado);

        }
    }
}
