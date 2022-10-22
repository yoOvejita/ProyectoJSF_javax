package com.pepe.interceptores;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.pepe.anotaciones.Tiempo;
@Interceptor
@Tiempo
public class TiempoInterceptor {
		@AroundInvoke
		public Object TiempoInvocacion(InvocationContext con) throws Exception{
			long inicio = System.currentTimeMillis();
			Object resultado = con.proceed();
			String parametro = (String) con.getParameters()[0];
			if(parametro ==  null)
				con.setParameters(new String[] {"hola"});
			return resultado.toString() + " tiempo calculado: " + 
					(System.currentTimeMillis() - inicio) + "[ms].";			
		}
}
