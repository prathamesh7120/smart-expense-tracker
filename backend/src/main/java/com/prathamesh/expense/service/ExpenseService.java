package com.prathamesh.expense.service;

import com.prathamesh.expense.entity.Expense;
import com.prathamesh.expense.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

   public Expense SaveExpense(Expense expense) {
        return expenseRepository.save(expense);
   }

   public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
   }

   public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
   }

}
