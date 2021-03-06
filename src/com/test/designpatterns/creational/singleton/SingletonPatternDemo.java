package com.test.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 * Ensures that only one object is created of a particular class throughout
 * execution.
 * 
 * e.g. log4j logging - Logger.getLogger(HelloWorld.class);
 * java.lang.Runtime#getRuntime()
 * 
 * @author vigoel
 *
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {
	}
}

class EagerSingleton {
	private static volatile EagerSingleton instance = new EagerSingleton();

	// private constructor
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}

class StaticBlockSingleton {
	private static final StaticBlockSingleton INSTANCE;

	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Uffff, i was not expecting this!", e);
		}
	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}

	private StaticBlockSingleton() {
		// ...
	}
}

// Lazy Singleton with double check locking
class LazyDoubleCheckSingleton {
	private static volatile LazyDoubleCheckSingleton instance = null;

	// private constructor
	private LazyDoubleCheckSingleton() {
	}

	public static LazyDoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				// Double check
				if (instance == null) {
					instance = new LazyDoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}

class PerfectSingleton implements Serializable, Cloneable {
	private volatile static PerfectSingleton instance = null;

	public static PerfectSingleton getInstance() {
		if (instance == null) {
			synchronized (PerfectSingleton.class) {
				// Double check
				if (instance == null) {
					instance = new PerfectSingleton();
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return getInstance();
	}

	protected Object clone() {
		return getInstance();
	}
}

class PerfectSingletonWithInnerClass implements Serializable {
	private static final long serialVersionUID = 1L;

	private PerfectSingletonWithInnerClass() {
		// private constructor
	}

	private static class InnerSingletonHolder {
		public static final PerfectSingletonWithInnerClass INSTANCE = new PerfectSingletonWithInnerClass();
	}

	public static PerfectSingletonWithInnerClass getInstance() {
		return InnerSingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}

enum EnumSingleton {
	INSTANCE;
	public void someMethod(String param) {
		// some class member
	}
}