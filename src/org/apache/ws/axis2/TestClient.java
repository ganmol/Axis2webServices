package org.apache.ws.axis2;

public class TestClient {

	public static void main(String[] args) {
		try{
			ServiceStub stub = new ServiceStub();
			Add add = new Add();
			//ServiceStub.Add params = new ServiceStub.Add();
			params.setI(10);
			params.setJ(30);
			
			ServiceStub.AddResponse response =   stub.add(params);
			int result = response.get_return();
			System.out.println("Reuslt from server side service to client is"+ result);
			
			}catch (Exception e){
				e.printStackTrace();
			}

	}

}
