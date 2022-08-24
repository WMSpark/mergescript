/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/* perform any action on widgets/variables within this block */
Page.onReady = function() {
    /*
     * variables can be accessed through 'Page.Variables' property here
     * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
     * Page.Variables.loggedInUser.getData()
     *
     * widgets can be accessed through 'Page.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Page.Widgets.username.datavalue'
     */
};

Page.getTodaysTaskonSuccess = function(variable, data) {
    Page.Widgets.calendar.selecteddata = data;
};

Page.setConditionalClass = function(priority) {
    if (priority == "Medium priority")
        return "text-success";
    if (priority == "High priority")
        return "text-danger";
}