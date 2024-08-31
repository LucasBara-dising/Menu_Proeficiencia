package com.example.menu_proeficiencia;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;

public class BancoDados extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Banco.db";
    private static final int DATABASE_VERSION = 1;

    // Tabela CLIENTE
    private static final String TABLE_CLIENTE = "CLIENTE";
    private static final String COL_CLI_CPF = "cli_cpf";
    private static final String COL_CLI_NOME = "cli_nome";
    private static final String COL_CLI_TELEFONE = "cli_telefone";

    // Tabela PEDIDOS
    private static final String TABLE_PEDIDOS = "PEDIDOS";
    private static final String COL_PED_ID = "ped_id";
    private static final String COL_PED_CODIGO = "ped_codigo";
    private static final String COL_PED_PRODUTO = "ped_produto";
    private static final String COL_PED_DESCRICAO = "ped_descricao";
    private static final String COL_PED_DATA = "ped_data";
    private static final String COL_PED_VALOR = "ped_valor";
    private static final String COL_PED_IMAGEM = "ped_imagem";

    public BancoDados(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // Cria a tabela CLIENTE
        String createTableCliente = "CREATE TABLE " + TABLE_CLIENTE + " (" +
                COL_CLI_CPF + " VARCHAR(11) PRIMARY KEY, " +
                COL_CLI_NOME + " VARCHAR(255), " +
                COL_CLI_TELEFONE + " VARCHAR(15) " +
                ")";

        db.execSQL(createTableCliente);

        // Cria a tabela PEDIDOS
        String createTablePedidos = "CREATE TABLE " + TABLE_PEDIDOS + " (" +
                COL_PED_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_PED_CODIGO + " VARCHAR(20), " +
                COL_PED_PRODUTO + " VARCHAR(255), " +
                COL_PED_DESCRICAO + " TEXT, " +
                COL_PED_DATA + " DATE, " +
                COL_PED_VALOR + " DECIMAL(10,2), " +
                COL_PED_IMAGEM + " BLOB, " +
                COL_CLI_CPF + " VARCHAR(11) " +
                ")";
        db.execSQL(createTablePedidos);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Caso haja necessidade de atualização, adicione aqui o código para migrar os dados
    }

    //Insert User
    void addUser(Array dadosInsert){
        //estancia para escrita no banco
        SQLiteDatabase db=this.getWritableDatabase();

//        ContentValues values= new ContentValues();
//        values.put(COL_CLI_CPF, userGit.getName());
//        values.put(COL_CLI_NOME, userGit.getName());
//        values.put(COL_CLI_TELEFONE, userGit.getName());
//
//        //inseri no banco
//        db.insert(TABLE_CLIENTE, null, values);
        db.execSQL("INSERT INTO CLIENTE (cli_cpf, cli_nome, cli_telefone) VALUES ('12345678901', 'João da Silva', '(11) 9999-9999');");
        db.close();
    }

    public Cursor select(){
        SQLiteDatabase db=this.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM PEDIDOS", null);
        return cursor;
    }

    void ApagaTodosusers(){
        //estancia para escrita no banco
        SQLiteDatabase db=this.getWritableDatabase();

        db.delete(TABLE_CLIENTE, null, null);
        db.close();
    }

}


