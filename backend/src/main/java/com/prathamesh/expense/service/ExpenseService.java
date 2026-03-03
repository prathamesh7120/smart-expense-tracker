package com.prathamesh.expense.service;

import com.prathamesh.expense.entity.Expense;
import com.prathamesh.expense.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    private ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

   public Expense SaveExpense(Expense expense) {
        return expenseRepository.save(expense);
   }

}
