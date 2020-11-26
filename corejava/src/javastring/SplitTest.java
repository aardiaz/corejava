package javastring;

public class SplitTest {
	
	public static void main(String[] args) {
		
		String s = "Unless required by applicable law or agreed to in writing, software" + 
				"distributed under the License is distributed on an \"AS IS\" BASIS" + 
				"WITHOUT language WARRANTIES OR  CONDITIONS OF ANY KIND, either express or implied." + 
				"See the License for the specific language governing permissions and " + 
				"limitations under the License.";
		
		 String[] words = s.split("\\s");
		 
		 int cnt = 0;
		 
		 for(String w : words) {
			 
			 if(w.equalsIgnoreCase("language")) {
				 cnt++;
			 }
			 //System.out.println(w);
		 }
		 
		 System.out.println("Number of 'language' = "+cnt);
		
		
	}

}
