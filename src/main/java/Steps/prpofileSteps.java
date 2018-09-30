package Steps;

import Pages.UserProfilePage;

public class prpofileSteps {
    public void OpenUserProfile(){
        UserProfilePage profile = new UserProfilePage();
        profile.openProfileWindow();
    }
}
