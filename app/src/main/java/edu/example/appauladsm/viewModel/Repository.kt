
package edu.example.appauladsm.viewModel


import edu.example.appauladsm.roomDB.Pessoa
import edu.example.appauladsm.roomDB.PessoaDataBase
import kotlinx.coroutines.flow.Flow

class Repository(private val db: PessoaDataBase) {
    suspend fun upsertPessoa(pessoa: Pessoa) {
db.pessoaDao().upsertPessoa(pessoa)
}
    suspend fun deletePessoa(pessoa: Pessoa) {
db.pessoaDao().deletePessoa(pessoa)
}

    fun getAllPessoas() =  db.pessoaDao().getAllPessoas()


}
