package com.example.pc2fp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtEquipo: EditText = findViewById(R.id.txtEquipo)
        val txtFundacion: EditText = findViewById(R.id.txtEquipo)
        val txtTitulos: EditText = findViewById(R.id.txtTitulos)
        val txtImagenEquipo: EditText = findViewById(R.id.txtImagenEquipo)
        val btnGuardar: Button = findViewById(R.id.btnGuardar)


        val db = FirebaseFirestore.getInstance()
        val collectionRef = db.collection("liga")
        val auth = FirebaseFirestore.getInstance()


        btnGuardar.setOnClickListener {
            val equipo = btnGuardar.text.toString()
            val fundacion = btnGuardar.text.toString())
            val titulos = btnGuardar.text.toString()
            val imagenequipo = txtTitulos.text.toString()


        db.collection("liga")
            .addSnapshotListener(this){task, e ->
                if(e!=null){
                    Snackbar
                        .make(
                            findViewById(android.R.id.content)
                            ,"Ingreso de datos exitosos"
                            , Snackbar.LENGTH_LONG
                        ).show()
                }else {
                    Snackbar
                        .make(
                            findViewById(android.R.id.content)
                            ,"Credenciales inválidas"
                            , Snackbar.LENGTH_LONG
                        ).show()
                    startActivity(Intent(this, ListadoActivity::class.java))
                }
            }

    }
}