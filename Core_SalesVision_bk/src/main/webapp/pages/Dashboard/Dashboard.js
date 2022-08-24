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

Page.getLastMonthDate = function() {
    return moment().subtract(1, 'year').format('YYYY-MM-DD');
};
Page.reducer = ((sum, value) => sum + value.size);

Page.chart3Beforerender = function(widget, chartInstance) {
    widget.ynumberformat = "$,r"
    var svg = d3.select('svg');
    svg.append("linearGradient")
        .attr("id", "temperature-gradient")
        .attr("gradientUnits", "userSpaceOnUse")
        .attr("x1", 0).attr("y1", 200)
        .attr("x2", 0).attr("y2", 100)
        // .attr("x1", 0).attr("y1", Page.Variables.SalesChart.dataSet[0]["value"])
        // .attr("x2", 0).attr("y2", Page.Variables.SalesChart.dataSet[1]["value"])
        .selectAll("stop")
        .data([{
                offset: "0%",
                color: "#2e5bff38"
            },
            {
                offset: "100%",
                color: "#005fa3c7"
            }
        ])
        .enter().append("stop")
        .attr("offset", function(d) {
            return d.offset;
        })
        .attr("stop-color", function(d) {
            return d.color;
        });
};

Page.WSGetLeadsDataonSuccess = function(variable, data) {
    App.Variables.getLeadsCount.setData({
        dataValue: data.totalSize
    });
};

Page.SalesForceLoginonError = function(variable, data) {
    Page.Variables.SalesForceLogin.invoke();
};