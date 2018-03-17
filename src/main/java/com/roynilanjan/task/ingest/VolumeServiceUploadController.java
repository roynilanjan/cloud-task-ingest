package com.roynilanjan.task.ingest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VolumeServiceUploadController {
	
	@Autowired
	private TaskProcessor t;
	
	//pass in POST payload values
		@RequestMapping(path = "/tasks", method = RequestMethod.POST)
		public @ResponseBody
        String launchTask(@RequestBody String s) {
			
			t.publishRequest(s);
			
			System.out.println("request made");
			
			return "success";
		}
}
