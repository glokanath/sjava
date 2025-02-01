package com.example.filter;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.filter.response.ContextData;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class JustAccountContextBase {
	
	private JustAccountContextBase() {}
	
	/* The contextdata stored in a thread local */
	
	private ThreadLocal<ContextData> ctxThreadLocal = new ThreadLocal<>();
	
	/* Calls remove() on all thread-local variables of this calss */
	
    public void clearThreadLocals() {
    	if(ctxThreadLocal.get() !=null) {
    		ctxThreadLocal.remove();
    	}
    }
    
    
	/* Sets the context */
    public void setCtx(ContextData context) {
    	ctxThreadLocal.set(context);
    }
    
    public ContextData getCtx() {
    	ContextData ctx = ctxThreadLocal.get();
    	if(ctx == null) {
    		ctx = createEmptyContext();
    		ctxThreadLocal.set(ctx);
    	}
    	return ctx;
    }
    
    
    private ContextData createEmptyContext() {
    	return new ContextData();
    }
    
}
 