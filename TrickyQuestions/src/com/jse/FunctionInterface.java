package com.jse;

import java.io.Serializable;
import java.util.RandomAccess;

import com.date.operations.AgeException;


@FunctionalInterface
public interface FunctionInterface extends RandomAccess,Serializable,Cloneable {
public abstract  void m1()throws AgeException;
}
