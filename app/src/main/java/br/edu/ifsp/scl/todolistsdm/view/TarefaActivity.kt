package br.edu.ifsp.scl.todolistsdm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import br.edu.ifsp.scl.todolistsdm.R
import br.edu.ifsp.scl.todolistsdm.model.entity.Tarefa
import kotlinx.android.synthetic.main.activity_tarefa.*
import kotlinx.android.synthetic.main.toolbar.*
import splitties.toast.toast

class TarefaActivity : AppCompatActivity() {
    private var tarefa: Tarefa? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarefa)

        toolbarTb.title = getString(R.string.tarefa)
        setSupportActionBar(toolbarTb)

        /*
        Buscar referência com fonte de dados
         */

        /* Edição ou Nova? */
        tarefa = intent.getParcelableExtra(MainActivity.Constantes.TAREFA_EXTRA)
        if (tarefa != null) {
            nomeTarefaEt.setText(tarefa?.nome)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detalhe_tarefa, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.cancelarMi -> {
                /* Inserção ou Edição cancelada pelo usuário */
                toast("${if (tarefa == null) "Inserção" else "Edição"} cancelada.")
                finish()
            }
            R.id.salvarMi -> {
                /*
                Salva ou Atualiza Tarefa
                 */

                /*
                Retorna tarefa para MainActivity
                 */
            }
        }
        return true
    }
}
