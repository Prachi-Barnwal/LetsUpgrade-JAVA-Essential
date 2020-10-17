
public class Game {
	
	Question[] que=new Question[3];
    Player player=new Player();

    String[] quedata={"What is the Capital of India?","Which state has the largest population?","Most Spoken Language in India?"};
    String[] op1={"Delhi","West Bengal","English,Sanskarit"};
    String[] op2={"UttarPradesh","Andhra Pradesh","Bengali,English"};
    String[] op3={"Rajasthan","UttarPradesh","Sanskarit,Hindi"};
    String[] op4={"Mumbai","Punjab","Hindi,English"};
    int[] ans={1,3,4};
    
    public void workgame()
    {
        for(int i=0;i<3;i++){
            que[i]=new Question();
        }
        for(int i=0;i<3;i++)
        {

        que[i].que=quedata[i];
        que[i].op1=op1[i];
        que[i].op2=op2[i];
        que[i].op3=op3[i];
        que[i].op4=op4[i];
        que[i].cans=ans[i];
        }


    }
    public void play()
    {

          player.detail();
          for(int i=0;i<3;i++)
          {
              boolean status=que[i].askquestion();
              if(status==true)
              {
                  System.out.println("WOW! Well Played");
                  player.score=player.score+10;
              }
              else{
                  System.out.println("OOPS! Wrong Answer");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}
