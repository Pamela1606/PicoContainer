package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Base.BaseUtil;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.BlogManager;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Category.CategoryPostPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Posts.PostPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.AddCars.AddCarPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.CarsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.EditCars.EditCarPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.CarsSettings.CarsSettingsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras.AddExtras.AddExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras.CarsExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;

import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.AddNew.AddNewPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.AddExtraPage.AddExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.EditExtraPage.EditExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ViewPage.ViewPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.AddTours.AddToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.EditTours.EditToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.ToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.ToursManagement;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

public class StepsDefinitionPHPtravel extends BaseUtil {
    private Login login;
    private BaseUtil base;
    Scenario scenario;
    private Dashboard dashboardPage;
    private BlogManager blogManager;
    private PostPage postPage;
    private CategoryPostPage categoryBlogPage;



    //Tours
    private ToursPage toursPage;
    private AddToursPage addToursPage;
    private EditToursPage editToursPage;
    private String nameToursDeleted;
    private AddNewPage addNewPage;
    private ExtrasPage extrasPage;
    private AddExtraPage addExtraPage;
    private org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.AddExtraPage.AddExtraPage addExtraPageT;
    private EditExtraPage editExtraPage;
    private ViewPage viewPage;
    private org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Settings.SettingsPage settingsPageT;
    private ToursManagement toursManagement;


    // Option Cars
    private CarsPage carsPage;
    private AddCarPage addCarPage;
    private EditCarPage editCarPage;
    private String carNameDeleted;

    private CarsSettingsPage carsSettingsPage;
    private String carTypeNameDeleted;

    private CarsExtrasPage carsExtrasPage;
    private AddExtrasPage addExtrasPage;

    public StepsDefinitionPHPtravel(BaseUtil base) {
        this.base = base;
    }

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboardPage = login.setCredentials();
    }


    // Option ToursPage
    @And("^click on tours menu$")
    public void clickOnToursMenu() {
        //dashboardPage = new Dashboard();
       toursManagement = dashboardPage.clickToursMenu();
    }

    @And("^go to the tours page$")
    public void goToTheToursPage() {
        toursPage = toursManagement.clickTourMenuTours();
    }

    @And("^click on add button on Tours page$")
    public void clickOnAddButtonT() {
        addToursPage = toursPage.clickAddButton();
    }

    @And("^select \"([^\"]*)\" Status on Add Tours page$")
    public void selectStateT(String arg0) throws Throwable {
        addToursPage = addToursPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Name field on Add Tours page$")
    public void fillNameFieldTours(String arg0) throws Throwable {
        addToursPage = addToursPage.fillName(arg0);
    }

    @And("^fill \"([^\"]*)\" Quantity Adults field on Add Tours page$")
    public void fillQuantityAdultsFieldOnAddToursPage(String arg0) throws Throwable {
        addToursPage = addToursPage.fillQuantityAdults(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Adults field on Add Tours page$")
    public void fillPriceAdultsFieldOnAddToursPage(String arg0) throws Throwable {
        addToursPage = addToursPage.fillPriceAdults(arg0);
    }

    @And("^select \"([^\"]*)\" Stars on Add Tours page$")
    public void selectStars(String arg0) throws Throwable {
        addToursPage = addToursPage.selectStars(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Days field on Add Tours page$")
    public void fillTotalDaysField(String arg0) throws Throwable {
        addToursPage = addToursPage.fillTotalDays(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Nights field on Add Tours page$")
    public void fillTotalNightsField(String arg0) throws Throwable {
        addToursPage = addToursPage.fillTotalNights(arg0);
    }

    @And("^select \"([^\"]*)\" Tour Type on Add Tours page$")
    public void selectTourType(String arg0) throws Throwable {
        addToursPage = addToursPage.selectTourType(arg0);
    }

    @And("^select \"([^\"]*)\" Feature on Add Tours page$")
    public void selectFeature(String arg0) throws Throwable {
        addToursPage = addToursPage.selectFeature(arg0);
    }

    @And("^select \"([^\"]*)\" Location 1 on Add Tours page$")
    public void selectLocation1OnAddToursPage(String arg0) throws Throwable {
        addToursPage = addToursPage.selectLocation1(arg0);
    }

    @And("^click On Submit on Add Tours page$")
    public void clickOnSubmitOnAddToursPage() {
        toursPage = addToursPage.clickOnSubmit();
    }

    /*@And("^close Session in Dashboard page$")
    public void closeSesionOnDashboardPage() {
        login = dashboardPage.closeSesion();
    }*/
//Edit///
    @And("^click on Edit on Tours page to a Tours selected$")
    public void clickToEditOnToursPageListToAToursEditSelected() {
    editToursPage = toursPage.clickEditButton();
}

    @And("^click to tab 'General' on Tours Edit selected$")
    public void clickToTabGeneralOnToursEditSelected() {

        editToursPage = editToursPage.clickEditGeneral();
    }

    @And("^update data form of 'general tab' in edit Tours page$")
    public void updateDataFormOfGeneralTabInEditToursPage(DataTable dataTable) {
        List<Map<String, String>> editDataTours = dataTable.asMaps(String.class, String.class);
        toursPage = editToursPage.updateDataFormOfGeneralTab(editDataTours);
    }

    @Then("^Verify that the \"([^\"]*)\" message is displayed on Tours page$")
    public void verifyTheMessageIsDisplayedOnListToursPage(String messageExpected) throws Throwable {
        String messageActual = toursPage.getMessageNotification();
        Assert.assertEquals(messageActual, messageExpected);
    }
//Delete//
    @And("^click to 'delete option' on the registry first on Tours on dashboard page$")
    public void clickToDeleteOptionOnTheRegistryFirstOnToursOnDashboardPage() {
    nameToursDeleted = toursPage.getNameTours();
    toursPage = toursPage.clickDeleteButton();
}

    @And("^click to 'ok button' of the 'pop-up window' on the Tours page$")
    public void clickToOkButtonOfThePopUpWindowOnTheToursPage() {

        toursPage = toursPage.clickOkToDelete();
    }

    @Then("^Verify that 'Tours Name' was deleted of the Tours  into dashboard page$")
    public void verifyThatToursNameWasDeletedOfTheToursIntoDashboardPage() {
        String nameToursActual = toursPage.getNameTours();
        Assert.assertNotSame(nameToursActual, nameToursDeleted);
    }
//Add New//
    @And("^go to the Add New page$")
    public void goToTheAddNewPage() {
        addNewPage = toursManagement.clickTourMenuAddNew();
    }

    @And("^select \"([^\"]*)\" Status on Add New page$")
    public void selectStateFields(String arg0) throws Throwable {
        addNewPage = addNewPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Name field on Add New page$")
    public void fillNamesFields(String arg0) throws Throwable {
        addNewPage = addNewPage.fillName(arg0);
    }

    @And("^fill \"([^\"]*)\" Quantity Adults field on Add New page$")
    public void fillQuantityAdultsFieldsOnAddToursPage(String arg0) throws Throwable {
        addNewPage = addNewPage.fillQuantityAdults(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Adults field on Add New page$")
    public void fillPriceAdultsFieldsOnAddToursPage(String arg0) throws Throwable {
        addNewPage = addNewPage.fillPriceAdults(arg0);
    }

    @And("^select \"([^\"]*)\" Stars on Add New page$")
    public void selectStar(String arg0) throws Throwable {
        addNewPage = addNewPage.selectStars(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Days field on Add New page$")
    public void fillTotalDaysFields(String arg0) throws Throwable {
        addNewPage = addNewPage.fillTotalDays(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Nights field on Add New page$")
    public void fillTotalNightsFields(String arg0) throws Throwable {
        addNewPage = addNewPage.fillTotalNights(arg0);
    }

    @And("^select \"([^\"]*)\" Tour Type on Add New page$")
    public void selectToursType(String arg0) throws Throwable {
        addNewPage = addNewPage.selectTourType(arg0);
    }

    @And("^select \"([^\"]*)\" Feature on Add New page$")
    public void selectFeatures(String arg0) throws Throwable {
        addNewPage = addNewPage.selectFeature(arg0);
    }

    @And("^select \"([^\"]*)\" Location 1 on Add New page$")
    public void selectLocation1OnAddNewPage(String arg0) throws Throwable {
        addNewPage = addNewPage.selectLocation1(arg0);
    }

    @And("^click On Submit on Add New page$")
    public void clickOnSubmitOnAddNewPage() {
        toursPage = addNewPage.clickOnSubmit();
    }
///Extras///
    @And("^go to the Extras page$")
    public void goToTheAirlinePage() {
    extrasPage = toursManagement.clickTourMenuExtras();
}

    @And("^click on add button on Extras page$")
    public void clickOnAddButtonOnExtrasPage() {
        addExtraPage = extrasPage.clickAddButton();
    }

    @And("^fill \"([^\"]*)\" Name field on Add Extra page$")
    public void fillNameFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.fillFieldName(arg0);
    }

    @And("^fill \"([^\"]*)\" Country field on Add Extras page$")
    public void fillCountryFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Name field on Add Extras page$")
    public void fillNameFieldOnAddExtrasPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.fillFieldName(arg0);
    }

    @And("^fill \"([^\"]*)\" Status field on Add Extras page$")
    public void fillStatusFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Price field on Add Extras page$")
    public void fillPriceFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.fillFieldPrice(arg0);
    }

    @And("^click button Save and Return on Add Extras page$")
    public void clickButtonSaveAndReturnOnAddExtraPage() {

        extrasPage = addExtraPage.saveReturnButton();
    }

    @And("^click on Search button on Extras page$")
    public void clickOnSearchButtonOnExtrasPage() {
        extrasPage = extrasPage.clickOnSearchButton();

    }

    @And("^fill element to search \"([^\"]*)\" Search field on Extras page$")
    public void fillElementToSearchSearchFieldOnExtrasPage(String arg0) throws Throwable {
        extrasPage = extrasPage.fillSearchField(arg0);
    }

    @And("^select by field \"([^\"]*)\" on Extras page$")
    public void selectByFieldOnExtrasPage(String arg0) throws Throwable {
        extrasPage = extrasPage.selectField(arg0);
    }

    @And("^click on GO button on Extras page$")
    public void clickOnGOButtonOnExtrasPage() {

        extrasPage = extrasPage.clickOnGoButton();
    }

    @And("^choose the element to select on Extras page$")
    public void chooseTheElementToSelectOnExtrasPage() {

        extrasPage = extrasPage.chooseLastElementToSelect();
    }

    @And("^click on icon edit element selected on Extras page$")
    public void clickOnIconEditElementSelectedOnExtraPage() {
        editExtraPage = extrasPage.clickIconElementToEdit();
    }

    @And("^edit with \"([^\"]*)\" Name field on Edit Extras page$")
    public void editWithNameFieldOnEditExtrasPage(String arg0) throws Throwable {
        editExtraPage = editExtraPage.fillFieldName(arg0);
    }

    @And("^edit select \"([^\"]*)\" Status field on Edit Extras page$")
    public void editWithStatusFieldOnEditExtrasPage(String arg0) throws Throwable {
        editExtraPage = editExtraPage.selectStatus(arg0);
    }

    @And("^edit with \"([^\"]*)\" Price field on Edit Extras page$")
    public void editWithPriceFieldOnEditExtrasPage(String arg0) throws Throwable {
        editExtraPage = editExtraPage.fillFieldPrice(arg0);
    }

    @And("^click button Save and Return on Edit Extras page$")
    public void clickButtonSaveAndReturnOnEditExtrasPage() {
        extrasPage = editExtraPage.saveReturnButton();
    }

    @And("^click on icon delete element selected on Extras page$")
    public void clickOnIconDeleteElementSelectedOnExtrasPage() {
        extrasPage = extrasPage.clickIconElementToDelete();
    }

    @And("^press on the Enter key to delete the chosen element on Extras page$")
    public void pressOnTheEnterKeyToDeleteTheChosenElementOnExtrasPage() {
        extrasPage = extrasPage.pressEnterKey();
    }

    @And("^click on icon inspect element selected on Extras page$")
    public void clickOnIconInspectElementSelectedOnExtrasPage() {
        viewPage = extrasPage.clickIconElementToInspect();
    }

    @And("^check with \"([^\"]*)\" Name field on View page$")
    public void checkWithNameFieldOnViewPage(String expected) throws Throwable {
        String actual = viewPage.getFieldName();
        Assert.assertEquals(actual,expected);
    }

    @And("^check with \"([^\"]*)\" Status field on View page$")
    public void checkWithCountryFieldOnViewPage(String expected) throws Throwable {
        String actual = viewPage.getSelectStatus();
        Assert.assertEquals(actual,expected);
    }

    @And("^check with \"([^\"]*)\" Price field on View page$")
    public void checkWithPriceFieldOnViewPage(String expected) throws Throwable {
        String actual = viewPage.getFieldPrice();
        Assert.assertEquals(actual,expected);
    }

    @And("^click button Return on Views page$")
    public void clickButtonReturnOnViewPage() {
        extrasPage = viewPage.clickButtonReturn();
    }
//Settings//







    // Option Cars
    @And("^click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'$")
    public void clickOnTheCARSOptionOfTheLeftMenuInTheDashboardPage() {
        dashboardPage = dashboardPage.selectCarsOption();
    }

    @And("^click on the 'CARS suboption' of the menu into 'CARS option'$")
    public void clickOnTheCARSSuboptionOfTheMenuIntoCARSOption() {
        carsPage = dashboardPage.selectSuboptionCarsOfCarsOption();
    }

    @Then("^verify that \"([^\"]*)\" title is displayed into 'cars page'$")
    public void verifyThatTitleIsDisplayedIntoCarListPage(String expectedTitle) {
        String actualTitle = carsPage.getTitleDisplayed();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @And("^click on the 'ADD button' on top of the 'cars page'$")
    public void clickOnTheADDButtonOnTopOfTheCarListPage() {
        addCarPage = carsPage.clickAddButton();
    }

    @And("^fill 'general tab form' of 'add car page' with the following data$")
    public void fillGeneralTabFormOfAddCarPageWithTheFollowingData(List<Map<String, String>> data) {
        carsPage = addCarPage.fillGeneralTabForm(data);
    }

    @Then("^verify that \"([^\"]*)\" is displayed in the first record of the 'car table' in 'cars page'$")
    public void verifyThatIsDisplayedInTheFirstRecordOfTheCarTableInCarsPage(String expectedCarName) {
        String actualCarName = carsPage.getNameOfFirstRecord();

        Assert.assertEquals(actualCarName, expectedCarName);
    }

    @And("^click on the 'edit option' of the first record in the 'cars page'$")
    public void clickOnTheEditOptionOfTheFirstRecordInTheCarsPage() {
        editCarPage = carsPage.clickEditButtonOfFirstRecord();
    }

    @And("^click on the 'Meta info tab' in the 'edit car page'$")
    public void clickOnTheMetaInfoTabInTheEditCarPage() {
        editCarPage = editCarPage.clickOnTheMetaInfoTab();
    }

    @And("^fill 'Meta info form' of 'edit car page' with the following data$")
    public void fillMetaInfoFormOfEditCarPageWithTheFollowingData(List<Map<String, String>> data) {
        carsPage = editCarPage.fillMetaInfoForm(data);
    }

    @Then("^verify that \"([^\"]*)\" notification message is displayed in the 'cars page'$")
    public void verifyThatMessageIsDisplayedInTheCarsPage(String expectedMessage) {
        String actualMessage = carsPage.getNotificationMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^click on the 'delete option' of the first record in the 'cars page'$")
    public void clickOnTheDeleteOptionOfTheFirstRecordInTheCarsPage() {
        carNameDeleted = carsPage.getNameOfFirstRecord();

        carsPage = carsPage.clickDeleteOptionOfFirstRecord();
    }

    @And("^click on the 'accept button' of the 'confirm dialog' on the 'cars page'$")
    public void clickOnTheAcceptButtonOfTheConfirmDialogOnTheCarsPage() {
        carsPage = carsPage.clickAcceptButtonDelete();
    }

    @Then("^verify that 'car name' of the deleted record does not display in the 'cars page'$")
    public void verifyThatCarNameOfTheDeletedRecordDoesNotDisplayInTheCarsPage() {
        String actualCarName = carsPage.getNameOfFirstRecord();

        Assert.assertNotSame(actualCarName, carNameDeleted);
    }

    @And("^click on the 'CARS SETTINGS suboption' of the menu into 'CARS option'$")
    public void clickOnTheCARSSETTINGSSuboptionOfTheMenuIntoCARSOption() {
        carsSettingsPage = dashboardPage.selectSuboptionCarsSettingsOfCarsOption();
    }

    @And("^click on the 'Types tab' in the 'cars settings page'$")
    public void clickOnTheTypesTabInTheCarsSettingsPage() {
        carsSettingsPage = carsSettingsPage.clickOnTheTypesTab();
    }

    @And("^click on the 'ADD button' on top of 'Types list' in the 'cars settings page'$")
    public void clickOnTheADDButtonOnTopOfTypesListInTheCarsSettingsPage() {
        carsSettingsPage = carsSettingsPage.clickAddButtonOfTypesTab();
    }

    @And("^fill 'add car type modal form' of 'car settings page' with the following data$")
    public void fillAddCarTypeModalFormOfCarSettingsPageWithTheFollowingData(List<Map<String, String>> data) {
        carsSettingsPage = carsSettingsPage.fillAddCarTypeModalForm(data);
    }

    @Then("^verify that \"([^\"]*)\" is displayed in the first record of the 'car type table' of 'Types tab' option in 'cars settings page'$")
    public void verifyThatIsDisplayedInTheFirstRecordOfTheCarTypeTableOfTypesTabOptionInCarsSettingsPage(String expectedCarTypeName) {
        clickOnTheTypesTabInTheCarsSettingsPage();

        String actualCarTypeName = carsSettingsPage.getNameOfFirstRecordOfTabTypes();

        Assert.assertNotSame(actualCarTypeName, expectedCarTypeName);
    }

    @And("^click on the 'edit option' of the first record in the 'Types tab' of 'cars settings page'$")
    public void clickOnTheEditOptionOfTheFirstRecordInTheTypesTabOfCarsSettingsPage() {
        carsSettingsPage = carsSettingsPage.clickEditButtonOfFirstRecordTypesTab();
    }

    @And("^fill 'update car type modal form' of 'car settings page' with the following data$")
    public void fillUpdateCarTypeModalFormOfCarSettingsPageWithTheFollowingData(List<Map<String, String>> data) {
        carsSettingsPage = carsSettingsPage.fillUpdateCarTypeModalForm(data);
    }

    @Then("^verify that \"([^\"]*)\" notification message is displayed in the 'cars settings page'$")
    public void verifyThatNotificationMessageIsDisplayedInTheCarsSettingsPage(String expectedMessage) throws Throwable {
        String actualMessage = carsSettingsPage.getNotificationMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^click on the 'delete option' of the first record in the 'Types tab' of 'cars settings page'$")
    public void clickOnTheDeleteOptionOfTheFirstRecordInTheTypesTabOfCarsSettingsPage() {
        carTypeNameDeleted = carsSettingsPage.getNameOfFirstRecordOfTabTypes();

        carsSettingsPage = carsSettingsPage.clickDeleteOptionOfFirstRecordTypesTab();
    }

    @And("^click on the 'accept button' of the 'confirm dialog' on the 'cars settings page'$")
    public void clickOnTheAcceptButtonOfTheConfirmDialogOnTheCarsSettingsPage() {
        carsSettingsPage = carsSettingsPage.clickAcceptButtonDelete();
    }

    @Then("^verify that 'car name' of the deleted record does not display in the 'Types tab' of 'cars settings page'$")
    public void verifyThatCarNameOfTheDeletedRecordDoesNotDisplayInTheTypesTabOfCarsSettingsPage() {
        clickOnTheTypesTabInTheCarsSettingsPage();

        String actualCarTypeName = carsSettingsPage.getNameOfFirstRecordOfTabTypes();

        Assert.assertNotSame(actualCarTypeName, carTypeNameDeleted);
    }

    @And("^click on the 'EXTRAS suboption' of the menu into 'CARS option'$")
    public void clickOnTheEXTRASSuboptionOfTheMenuIntoCARSOption() {
        carsExtrasPage = dashboardPage.selectSuboptionExtrasOfCarsOption();
    }

    @And("^click on the 'ADD button' in the 'extras page'$")
    public void clickOnTheADDButtonInTheExtrasPage() {
        addExtrasPage = carsExtrasPage.clickAddButton();
    }

    @And("^fill 'extra form' of 'add extras page' with the following data$")
    public void fillExtraFormOfAddExtrasPageWithTheFollowingData(List<Map<String, String>> data) {
        carsExtrasPage = addExtrasPage.fillFormWithSaveAndReturnButton(data);
    }

    @Then("^verify that \"([^\"]*)\" is displayed in the first record of the column 'Name' in 'extras page'$")
    public void verifyThatIsDisplayedInTheFirstRecordOfTheColumnNameInExtrasPage(String expectedName) {
        String actualName = carsExtrasPage.getNameOfFirstRecord();

        Assert.assertEquals(actualName, expectedName);
    }

    @And("^verify that \"([^\"]*)\" is displayed in the first record of the column 'Price' in 'extras page'$")
    public void verifyThatIsDisplayedInTheFirstRecordOfTheColumnPriceInExtrasPage(String expectedPrice) {
        String actualPrice = carsExtrasPage.getPriceOfFirstRecord();

        Assert.assertEquals(actualPrice, expectedPrice);
    }

    // Option Blog
    @And("^click on blog menu$")
    public void clickOnBlogMenu() {
        blogManager = dashboardPage.clickBlogMenu();
    }

    @And("^go to the 'Post' in blog page$")
    public void goToToTheBlogPage() {
        postPage = blogManager.clickPostMenu();
    }

    @And("^click on 'Search' in post page$")
    public void clickOnSearchInPostPage() {
        postPage.clickSearch();
    }

    @And("^search \"([^\"]*)\" on post page$")
    public void searchOnPostPage(String name) throws Throwable {
        postPage.searchElement(name);
    }

    @And("^click 'go button' on Post page$")
    public void clickGoButtonOnPostPage() {
        postPage.clickButton();
    }

    @And("^client en 'delete post' in post page$")
    public void clientEnDeletePostInPostPage() {
        postPage.clickDeletePostPage();
    }

    @And("^press on the Enter key to delete in post page$")
    public void pressOnTheEnterKeyToDeleteInPostPage() {
        postPage.pressEnterDelete();
    }

    @And("^close Session on Dashboard page$")
    public void cerrarSesionOnDashboardPage() {
        login = dashboardPage.closeSesion();
    }

    @And("^click in new in blog page$")
    public void clickInNewInBlogPage() {
        postPage.clickNew();
    }

    @And("^check List in blog nemu$")
    public void assertListInBlogSecction() {
        blogManager.setValuesModelexpexted();
    }

    @Then("^assert list in blog secction:$")
    public void assertListInBlogSecction(DataTable datos) throws Throwable {
        blogManager.checkAssert(datos);
    }

    @And("^check \"([^\"]*)\" in secction Post into blogs$")
    public void checkInSecctionPostIntoBlogs(String arg0) throws Throwable {
        postPage.checkBlogmanagerTitle(arg0);
    }

    @Then("^fill in data for new post:$")
    public void fillInDataForNewPost(DataTable datos) throws Throwable {
        postPage.setfillDatainPost(datos);
    }

    @And("^press on the Enter key to create in post page$")
    public void pressOnTheEnterKeyToCreateInPostPage() {
        postPage.pressEnterNew();
    }

    @And("^click en edit in post page$")
    public void clickEnEditInPostPage() {
        postPage.editElement();
    }

    @And("^change value into post \"([^\"]*)\"$")
    public void changeValueIntoPost(String arg0) throws Throwable {
        postPage.setElementIntoPost(arg0);
    }

    @And("^press on the Enter key to Update in post page$")
    public void pressOnTheEnterKeyToUpdateInPostPage() {
        postPage.clickUpdatePost();
    }

    @And("^select the first element and save value$")
    public void selectTheFirstElementAndSaveValue() {
        postPage.selectFirtelement();
    }

    @And("^first value salved search on post page$")
    public void firstValueSalvedSearchOnPostPage() {
        postPage.searchSalveElement();
    }

    @And("^assert not exist element firts salve$")
    public void assertNotExistElementFirtsSalve() {
        postPage.assertFirtElement();
    }

    @And("^check \"([^\"]*)\" exist in post page$")
    public void checkExistInPostPage(String arg0) throws Throwable {
        postPage.checkTranlate(arg0);
    }

    @And("^go to the 'Category' in blog page$")
    public void goToTheCategoryInBlogPage() {
        categoryBlogPage = blogManager.clickCategoryMenu();
    }

    @And("^check \"([^\"]*)\" in secction category into blogs$")
    public void checkInSecctionCategoryIntoBlogs(String arg0) throws Throwable {
        categoryBlogPage.checkTitleExiste(arg0);
    }

    @And("^assert element with result in title$")
    public void assertElementWithResultInTitle() {
        categoryBlogPage.assertTitle();
    }

    @And("^click in new categoty into blog page$")
    public void clickInNewCategotyIntoBlogPage() {
        categoryBlogPage.clickNew();
    }

    @And("^fill name with \"([^\"]*)\" as new 'category'$")
    public void fillNameWithAsNewCategory(String arg0) throws Throwable {
        categoryBlogPage.fillNewCategory(arg0);
    }

    @And("^save new category in blog page$")
    public void saveNewCategoryInBlogPage() {
        categoryBlogPage.savenewCategory();
    }

    @And("^click on 'Search' in catoroty into post page$")
    public void clickOnSearchInCatorotyIntoPostPage() {
        categoryBlogPage.clickSearchCategory();
    }

    @And("^click 'go button' on category page$")
    public void clickGoButtonOnCategoryPage() {
        categoryBlogPage.goPageSearch();
    }

    @And("^check exist element in category$")
    public void checkExistElementInCategory() {
        categoryBlogPage.assertExistNewelement();
    }

    @And("^click en edit in category secction$")
    public void clickEnEditInCategorySecction() {
        categoryBlogPage.clickEdit();
    }

    @And("^change value into category name \"([^\"]*)\"$")
    public void changeValueIntoCategoryName(String arg0) throws Throwable {
        categoryBlogPage.changeNameCategory(arg0);
    }

    @And("^salve change value in category$")
    public void salveChangeValueInCategory() {
        categoryBlogPage.salveEdit();
    }

    @And("^assert new value \"([^\"]*)\"$")
    public void assertNewValue(String arg0) throws Throwable {
        categoryBlogPage.assertName(arg0);
    }

    @And("^click in delete in category secction$")
    public void clickInDeleteInCategorySecction() {
        categoryBlogPage.deleteElement();
    }

    @And("^assert value \"([^\"]*)\" not exist$")
    public void assertValueNotExist(String arg0) throws Throwable {
        categoryBlogPage.assertNotExist(arg0);
    }

}


