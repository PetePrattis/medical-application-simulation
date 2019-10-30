BufferedReader input1=new BufferedReader(new InputStreamReader(System.in));
			File file = new File(System.getProperty("user.dir")+"/src/studentsfile.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line="";

			String del=am;

			while((line = reader.readLine()) != null) {
			if(line.contains(del))
			{
				System.out.println("Give username: ");
				un = input.nextLine();
				System.out.println("Give name: ");
				n = input.nextLine();
				System.out.println("Give surname: ");
				sn = input.nextLine();
				System.out.println("Give department: ");
				dp = input.nextLine();
				String replacement=un+","+n+","+sn+","+dp+","+del+"\n";

			try {
				if(line.contains(del))
				{
					line= replacement.replace(del,line);
				}

				FileWriter writer = new FileWriter(System.getProperty("user.dir")+"/src/studentsfile.txt");
				writer.write(line);
				reader.close();
				writer.close();
			}finally {}
				
			}
		}