package tw.cbc.jacob;
aaaa
import com.jacob.com.Dispatch;

public class Jacob {
	private String dispatchName;
	private String methodName;
	private Object[] params;
	
	private Dispatch dispatch;
	public Jacob(String dispatchName){
		this.dispatchName = dispatchName;
		dispatch = new Dispatch(this.dispatchName);
	}
	
	public Jacob(String dispatchName,String methodName,Object[] params){
		this.dispatchName = dispatchName;
		this.methodName = methodName;
		this.dispatch = new Dispatch(this.dispatchName);
		this.params = params;
	}
	public String getDispatchName() {
		return dispatchName;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public Dispatch getDispatch() {
		return dispatch;
	}
	
	public Object call(){
		Object obj = null;
		if(params==null){
			obj = Dispatch.call(this.dispatch,this.methodName);
		}else if(params.length==0){
			obj = Dispatch.call(this.dispatch,this.methodName);
		}else if(params.length==1){
			obj = Dispatch.call(this.dispatch,this.methodName,params[0]);
		}else if(params.length==2){
			obj = Dispatch.call(this.dispatch,this.methodName,params[0],params[1]);
		}else if(params.length==3){
			obj = Dispatch.call(this.dispatch,this.methodName,params[0],params[1],params[2]);
		}else if(params.length==4){
			obj = Dispatch.call(this.dispatch,this.methodName,params[0],params[1],params[2],params[3]);
		}else if(params.length==5){
			obj = Dispatch.call(this.dispatch,this.methodName,params[0],params[1],params[2],params[3],params[4]);
		}else if(params.length==6){
			obj = Dispatch.call(this.dispatch,this.methodName,params[0],params[1],params[2],params[3],params[4],params[5]);
		}else if(params.length==7){
			obj = Dispatch.call(this.dispatch,this.methodName,params[0],params[1],params[2],params[3],params[4],params[5],params[6]);
		}else if(params.length==8){
			obj = Dispatch.call(this.dispatch,this.methodName,params[0],params[1],params[2],params[3],params[4],params[5],params[6],params[7]);
		}
		return obj;
	}
	
	public static void main(String[] args){
		Jacob jacob = new Jacob("SecureCnnStr");
		jacob.setMethodName("EntSecurCnnStr");
		jacob.setParams(new Object[]{"SOD","D:\\CBC\\encode\\","IBPS1455"});
		jacob.call();
		jacob.setMethodName("GetConnStr");
		jacob.setParams(null);
		String result = jacob.call().toString();
	}
}
