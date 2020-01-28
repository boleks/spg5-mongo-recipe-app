package com.boleks.spg5MongoRecipeApp.services;

import com.boleks.spg5MongoRecipeApp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
