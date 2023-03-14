package mx.edu.itson.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.btn_antojitos) as Button
        var btnEspecialidades: Button = findViewById(R.id.btn_especialidades) as Button
        var btnCombinaciones: Button = findViewById(R.id.btn_combinaciones) as Button
        var btnTortas: Button = findViewById(R.id.btn_tortas) as Button
        var btnSopas: Button = findViewById(R.id.btn_sopas) as Button
        var btnBebidas: Button = findViewById(R.id.btn_drinks) as Button
        // var imgA: ImageView = findViewById(R.id.imageView) as ImageView

        btnAntojitos.setOnClickListener{
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")

            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener{
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")

            startActivity(intent)
            // imgA.setImageResource(R.drawable.especialidades)
        }
        btnCombinaciones.setOnClickListener{
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Combinaciones")

            startActivity(intent)
            // imgA.setImageResource(R.drawable.combinations)
        }
        btnTortas.setOnClickListener{
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")

            startActivity(intent)
            // imgA.setImageResource(R.drawable.tortas)
        }
        btnSopas.setOnClickListener{
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")

            startActivity(intent)
            // imgA.setImageResource(R.drawable.sopas)
        }
        btnBebidas.setOnClickListener{
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Bebidas")

            startActivity(intent)
            // imgA.setImageResource(R.drawable.drinks)
        }



    }
}