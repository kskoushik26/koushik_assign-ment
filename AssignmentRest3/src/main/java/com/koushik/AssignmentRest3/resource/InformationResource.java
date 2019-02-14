package com.koushik.AssignmentRest3.resource;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.koushik.AssignmentRest3.InformationServicve.InformationService;
import com.koushik.AssignmentRest3.information.Information;

@Path("information")
public class InformationResource {
	@Path("{zipcode}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Information getAllInformation(@PathParam("zipcode") int ZipCode) {
		Information info = null;
		for (Information inf : InformationService.getAllInformation()) {
			if (ZipCode == inf.getZipcode()) {
				info = inf;
				/*break;*/
			}
		}
		return info;
	}

	/*public static void main(String[] args) {
		System.out.println(new InformationResource().getAllInformation(560010));
	}*/

}
