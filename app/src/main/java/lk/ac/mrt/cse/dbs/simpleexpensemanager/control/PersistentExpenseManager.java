package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentTransactionDAO;

/**
 * Created by Hasini on 11/20/2016.
 */
public class PersistentExpenseManager extends ExpenseManager {
    private Context c = null;

    //Constructor
    public PersistentExpenseManager( Context c) {
        this.c = c;
        setup();
    }


    public void setup()  {

        //Setup AccountDAO object
        AccountDAO persistentAccountDAO = new PersistentAccountDAO(c);
        setAccountsDAO(persistentAccountDAO);

        //Setup TransactionDAO object
        TransactionDAO persistentTransactionDAO = new PersistentTransactionDAO(c);
        setTransactionsDAO(persistentTransactionDAO);

    }
}
