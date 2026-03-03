package com.prathamesh.expense.controller;

import com.prathamesh.expense.entity.Expense;
import com.prathamesh.expense.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return  expenseService.SaveExpense(expense);
    }
}