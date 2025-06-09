const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm101zi/",
            name: "ssm101zi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm101zi/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "消防管理系统"
        } 
    }
}
export default base
