package com.firebase.pve;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class FragmentEditText extends Fragment {
    private EditText etTitle, etBody;
    private Button btnUpdate;
    private FirebaseAuth mAuth;
    private FirebaseFirestore db;
    private String documentId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_text, container, false);
        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
        etTitle = view.findViewById(R.id.etTitle);
        etBody = view.findViewById(R.id.etBody);
        btnUpdate = view.findViewById(R.id.btnUpdate);

        documentId = "1";
        loadDocumentInfo();

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDocument();
            }
        });

        return view;
    }

    private void loadDocumentInfo() {
        DocumentReference documentRef = db.collection("documents").document(documentId);
        documentRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    String currentTitle = documentSnapshot.getString("title");
                    String currentBody = documentSnapshot.getString("body");
                    etTitle.setText(currentTitle);
                    etBody.setText(currentBody);
                } else {
                    new AlertDialog.Builder(getActivity())
                            .setTitle("Error")
                            .setMessage("El documento no existe.")
                            .setPositiveButton("Aceptar", null)
                            .show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                new AlertDialog.Builder(getActivity())
                        .setTitle("Error")
                        .setMessage("Error al cargar el documento.")
                        .setPositiveButton("Aceptar", null)
                        .show();
            }
        });
    }

    private void updateDocument() {
        if (documentId == null) {
            new AlertDialog.Builder(getActivity())
                    .setTitle("Error")
                    .setMessage("ID del documento es nulo.")
                    .setPositiveButton("Aceptar", null)
                    .show();
            return;
        }

        String newTitle = etTitle.getText().toString().trim();
        String newBody = etBody.getText().toString().trim();

        if (newTitle.isEmpty() || newBody.isEmpty()) {
            new AlertDialog.Builder(getActivity())
                    .setTitle("Error")
                    .setMessage("Por favor, complete todos los campos.")
                    .setPositiveButton("Aceptar", null)
                    .show();
            return;
        }

        DocumentReference documentRef = db.collection("documents").document(documentId);
        documentRef
                .update("title", newTitle, "body", newBody)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("Éxito")
                                .setMessage("Documento actualizado correctamente.")
                                .setPositiveButton("Aceptar", null)
                                .show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("Error")
                                .setMessage("Error al actualizar el documento.")
                                .setPositiveButton("Aceptar", null)
                                .show();
                    }
                });
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
